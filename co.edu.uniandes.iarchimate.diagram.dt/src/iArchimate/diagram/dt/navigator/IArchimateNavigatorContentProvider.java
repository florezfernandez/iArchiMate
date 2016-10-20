package iArchimate.diagram.dt.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class IArchimateNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public IArchimateNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<iArchimate.diagram.dt.navigator.IArchimateNavigatorItem> result = new ArrayList<iArchimate.diagram.dt.navigator.IArchimateNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup) {
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup group = (iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) {
			iArchimate.diagram.dt.navigator.IArchimateNavigatorItem navigatorItem = (iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {

		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup links = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_DecisionTrace_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup incominglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_AttributeFact_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup incominglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_InstanceFact_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup outgoinglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_Decision_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup outgoinglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_Meeting_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup incominglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_RelationFact_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup incominglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_Observation_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup outgoinglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_Observation_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup outgoinglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_DirectObservation_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup outgoinglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_Person_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup incominglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_Person_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Node sv = (Node) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup outgoinglinks = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_Document_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup target = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_MeetingMeetingParticipants_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup source = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_MeetingMeetingParticipants_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup target = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_DecisionDecisionFacts_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup source = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_DecisionDecisionFacts_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup target = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_SourceSourceObservations_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup source = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_SourceSourceObservations_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID: {
			LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem> result = new LinkedList<iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup target = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_ObservationObservationFacts_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup source = new iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup(
					iArchimate.diagram.dt.part.Messages.NavigatorGroupName_ObservationObservationFacts_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
							.getType(iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID
				.equals(iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<iArchimate.diagram.dt.navigator.IArchimateNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<iArchimate.diagram.dt.navigator.IArchimateNavigatorItem> result = new ArrayList<iArchimate.diagram.dt.navigator.IArchimateNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new iArchimate.diagram.dt.navigator.IArchimateNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem) {
			iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem abstractNavigatorItem = (iArchimate.diagram.dt.navigator.IArchimateAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
